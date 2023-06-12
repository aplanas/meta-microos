SUMMARY = "Implements a XML/HTML/XHTML Markup safe string for Python"
DESCRIPTION = "Implements a unicode subclass that supports HTML strings. This can be used to \
safely encode strings for dynamically generated web pages."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "python311-MarkupSafe-2.1.2-2.1.aarch64.rpm"
RPM_HASH = "3aac99fed442572fffc4486e9db372e38641bb847e86bb8ebc450cfb3606dd7850332fbce19e7d1ac5feb82dd5caa8fb61e5039a25d0935656ccc3f950ecac52"

RPROVIDES:${PN} += "python3.11dist(markupsafe) \
python311-MarkupSafe \
python311-MarkupSafe(aarch-64) \
python3dist(markupsafe)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python311-base"

inherit rpm
