SUMMARY = "Python ORM for config files"
DESCRIPTION = "Python ORM for config files."
LICENSE = "LGPL-3.0-only"

PV = "0.1.82"

RPM_NAME = "python39-reconfigure-0.1.82-1.16.noarch.rpm"
RPM_HASH = "76af97d2c1dd7297660c9e0f523c6c89021bade334c7e695527bd9d87a798efce236f786f81f0e09979d682397b52f5edbca227898a7fdc5b1b807321d00c502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(reconfigure) \
python39-reconfigure \
python3dist(reconfigure)"

RDEPENDS:${PN} += "python(abi) \
python39-chardet"

inherit rpm
