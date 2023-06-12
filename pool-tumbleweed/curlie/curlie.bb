SUMMARY = "a frontend to curl that adds the ease of use of httpie"
DESCRIPTION = "If you like the interface of HTTPie but miss the features of curl, curlie is what you are searching for. Curlie is a frontend to curl that adds the ease of use of httpie, without compromising on features and performance. All curl options are exposed with syntax sugar and output formatting inspired from httpie."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "curlie-1.7.1-1.1.aarch64.rpm"
RPM_HASH = "e24b105ee9e3158d58b725f28fb17a70aee9ee342c643d6c97c82036306c56646642734e62ad225bdd97e97d0da22635bf0b86d06a68880c0298532871d2ecf0"

RPROVIDES:${PN} += "curlie \
curlie(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
