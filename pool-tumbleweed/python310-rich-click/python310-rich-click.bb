SUMMARY = "Format click help output nicely with rich"
DESCRIPTION = "Format click help output nicely with rich."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python310-rich-click-1.6.1-1.1.noarch.rpm"
RPM_HASH = "42469d5a14e6226433657ef45484baa1f46717902f5af46877f171542d234ef6a19c12bc8c4381eff75930ae6318323667543148b3555e0077fa276982ca4b4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rich-click \
python3.10dist-rich-click \
python310-rich-click \
python3dist-rich-click"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-click \
python310-rich"

inherit rpm
