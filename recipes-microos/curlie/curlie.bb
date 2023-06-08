SUMMARY = "a frontend to curl that adds the ease of use of httpie"
DESCRIPTION = "If you like the interface of HTTPie but miss the features of curl, curlie is what you are searching for. Curlie is a frontend to curl that adds the ease of use of httpie, without compromising on features and performance. All curl options are exposed with syntax sugar and output formatting inspired from httpie."
LICENSE = "MIT"

PV = "1.6.9"

RPM_NAME = "curlie-1.6.9-1.3.aarch64.rpm"
RPM_HASH = "f1a753290d85603901df48fe3797aff718ec0c0dcb29d2a5278580e38ccb79aa27b79d2b3ebce86548e31be844bdf0aeeda579365d13e32e71d7dec28eb4db9b"

RPROVIDES:${PN} += "curlie curlie(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
