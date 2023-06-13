SUMMARY = "Editable installations"
DESCRIPTION = "A Python library for creating 'editable wheels' \
 \
This library supports the building of wheels which, when installed, will expose \
packages in a local directory on sys.path in 'editable mode'. In other words, \
changes to the package source will be reflected in the package visible to \
Python, without needing a reinstall."
LICENSE = "MIT"

PV = "0.3"

RPM_NAME = "python310-editables-0.3-2.1.noarch.rpm"
RPM_HASH = "2a3a4e8b511053ba1453c31ec10924b5a627f36c0f25000e8d41fd667fd58c9a9816b564238981f2919a8b36303fdda00a887e6de986b9380fb4ae622974df0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-editables \
python3.10dist(editables) \
python310-editables \
python3dist(editables)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
