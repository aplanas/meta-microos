SUMMARY = "a frontend to curl that adds the ease of use of httpie"
DESCRIPTION = "If you like the interface of HTTPie but miss the features of curl, curlie is what you are searching for. Curlie is a frontend to curl that adds the ease of use of httpie, without compromising on features and performance. All curl options are exposed with syntax sugar and output formatting inspired from httpie."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "curlie-1.7.1-1.2.aarch64.rpm"
RPM_HASH = "3217ee225a2ab475198b192714a41cac7df6abce99236ded9ccb009d688312e1e8e236bdca5f87b9a4c86015557724008110a5757dabeb4e85812422246265ed"

RPROVIDES:${PN} += "curlie"

RDEPENDS:${PN} += ""

inherit rpm
