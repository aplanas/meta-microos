SUMMARY = "jQuery repackaged for the XStatic standard"
DESCRIPTION = "jQuery javascript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "3.5.1.1"

RPM_NAME = "python39-XStatic-jQuery-3.5.1.1-1.3.aarch64.rpm"
RPM_HASH = "bc6b31caf1d73cb120193df10abb0e44884187139ae4ffb2fdccad5e901035efa12640c98e09d4f34c58e3705cda39555c2c3e0a548c0ad096eada4af6ff71b4"

RPROVIDES:${PN} += "python3.9dist(xstatic-jquery) \
python39-XStatic-jQuery \
python39-XStatic-jQuery(aarch-64) \
python3dist(xstatic-jquery)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
