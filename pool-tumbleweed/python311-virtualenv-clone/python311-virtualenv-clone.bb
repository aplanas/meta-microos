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

RPM_NAME = "python311-virtualenv-clone-0.5.7-1.4.noarch.rpm"
RPM_HASH = "68b94f806e6473226479264d1084f04ec8b7be08a4bebd0bf396602a4a3ce6eafdd20303a192a37f26280c2e371c697942ff54acc61cb0cb790619e1307b14b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-virtualenv-clone \
python311-virtualenv-clone \
python3dist-virtualenv-clone"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-virtualenv \
update-alternatives"

inherit rpm
