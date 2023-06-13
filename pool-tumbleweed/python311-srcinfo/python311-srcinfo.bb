SUMMARY = "Python library to parse Arch SRCINFO files"
DESCRIPTION = "Python library to parse Arch .SRCINFO files."
LICENSE = "ISC"

PV = "0.1.1"

RPM_NAME = "python311-srcinfo-0.1.1-1.4.noarch.rpm"
RPM_HASH = "96e22a966832c8e7109d96c448d13085b78f67ce5bec662352d10aa0b3e30034e38b0ca1aba86c5e6afb4a064aa813068f6292e825005b50b1952659321ec44c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(srcinfo) \
python311-srcinfo \
python3dist(srcinfo)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-parse \
update-alternatives"

inherit rpm
