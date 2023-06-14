SUMMARY = "Easy thumbnails for Django"
DESCRIPTION = "The powerful, yet easy to implement thumbnailing application for Django."
LICENSE = "BSD-2-Clause"

PV = "2.8.5"

RPM_NAME = "python310-easy-thumbnails-2.8.5-1.4.noarch.rpm"
RPM_HASH = "5afe6fe419a5266ee698faa9a915686a682e7631664ddac914ae75c7b6a032d23f57580250faa2633f00e83f2688b2004efa8dcdd1ff29c66d0decb10d00847c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-easy-thumbnails \
python3.10dist-easy-thumbnails \
python310-easy-thumbnails \
python3dist-easy-thumbnails"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-Pillow \
python310-lxml \
python310-reportlab \
python310-svglib"

inherit rpm
