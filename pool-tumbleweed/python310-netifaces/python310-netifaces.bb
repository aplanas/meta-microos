SUMMARY = "Portable network interface information"
DESCRIPTION = "netifaces provides a (hopefully portable-ish) way for Python programmers to \
get access to a list of the network interfaces on the local machine, and to \
obtain the addresses of those network interfaces. \
 \
The package has been tested on Mac OS X, Windows XP, Windows Vista, Linux and \
Solaris. On Windows, it is currently not able to retrieve IPv6 addresses, \
owing to shortcomings of the Windows API. \
 \
It should work on other UNIX-like systems provided they implement either \
getifaddrs() or support the SIOCGIFxxx socket options, although the data \
provided by the socket options is normally less complete."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-netifaces-0.11.0-2.1.aarch64.rpm"
RPM_HASH = "64113b557775b8e3fce1d706fcf477071545a3d2268036facb286a26182ae8ef0d05aa6219ebdfc4fabae712dedcd58538837a789a27ffd80ce043e14a012116"

RPROVIDES:${PN} += "python3-netifaces \
python3.10dist(netifaces) \
python310-netifaces \
python310-netifaces(aarch-64) \
python3dist(netifaces)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
