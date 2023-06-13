SUMMARY = "Utility to replace one string into another in given list of files"
DESCRIPTION = "`subst` is simple utility to replace one string into another in given list of files."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-subst-0.4.0-3.15.noarch.rpm"
RPM_HASH = "fa8278fb8da3e6434233330494d1ad17b53fa7487b9d84a59868d03d4ebf7982eb329b76123581cb7443071110b969d0fda0186dc80a81f42d228c85c85bbeec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subst \
python3.10dist(subst) \
python310-subst \
python3dist(subst)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
