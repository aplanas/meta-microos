SUMMARY = "Format click help output nicely with rich"
DESCRIPTION = "Format click help output nicely with rich."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python39-rich-click-1.6.1-1.1.noarch.rpm"
RPM_HASH = "b107354ab44faf1de28620b9a2dd195ffac58d781a2c08006b45abe7e4b8b3b072651f3906788b6700a537c194c685df8031b973d0f66b9af13b7f5c64fcd6e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rich-click \
python39-rich-click \
python3dist-rich-click"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
python39-rich"

inherit rpm
