SUMMARY = "Format click help output nicely with rich"
DESCRIPTION = "Format click help output nicely with rich."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python311-rich-click-1.6.1-1.3.noarch.rpm"
RPM_HASH = "4f964c54ec3603771887bfac0ddbc72581a465c5e3806f4e458ecc3e052f32a4d4758add3c221a10ee0d89a93291449d15981056f07f3e0005836738279f8b31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rich-click \
python3.11dist-rich-click \
python311-rich-click \
python3dist-rich-click"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
python311-rich"

inherit rpm
