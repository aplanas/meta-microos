SUMMARY = "Script to clone virtualenvs"
DESCRIPTION = "virtualenv cloning script. \
 \
A script for cloning a non-relocatable virtualenv. \
 \
Virtualenv provides a way to make virtualenv's relocatable which could then be \
copied as we wanted. However making a virtualenv relocatable this way breaks \
the no-site-packages isolation of the virtualenv as well as other aspects that \
come with relative paths and '/usr/bin/env' shebangs that may be undesirable. \
 \
Also, the .pth and .egg-link rewriting doesn't seem to work as intended. This \
attempts to overcome these issues and provide a way to easily clone an \
existing virtualenv. \
 \
It performs the following: \
 \
- copies sys.argv[1] dir to sys.argv[2] \
- updates the hardcoded VIRTUAL_ENV variable in the activate script to the \
  new repo location. (--relocatable doesn't touch this) \
- updates the shebangs of the various scripts in bin to the new python if \
  they pointed to the old python. (version numbering is retained.) \
 \
    it can also change '/usr/bin/env python' shebangs to be absolute too, \
    though this functionality is not exposed at present. \
 \
- checks sys.path of the cloned virtualenv and if any of the paths are from \
  the old environment it finds any .pth or .egg-link files within sys.path \
  located in the new environment and makes sure any absolute paths to the \
  old environment are updated to the new environment. \
 \
- finally it double checks sys.path again and will fail if there are still \
  paths from the old environment present."
LICENSE = "MIT"

PV = "0.5.7"

RPM_NAME = "python39-virtualenv-clone-0.5.7-1.6.noarch.rpm"
RPM_HASH = "929a2010decab2b3743b4643bde2804db35d53a2c00743f24d6a5025ddffa7b597fef6e628aec35a77fa8da6ec279f64659043ca2ecb8fe96e9d5d44581a6f0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-virtualenv-clone \
python39-virtualenv-clone \
python3dist-virtualenv-clone"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-virtualenv \
update-alternatives"

inherit rpm
