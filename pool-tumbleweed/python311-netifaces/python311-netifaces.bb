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

RPM_NAME = "python311-netifaces-0.11.0-2.1.aarch64.rpm"
RPM_HASH = "5edbb010e386ba6dc677ae36d6c77563f57c6280a0346f62012da9b21df27e63104c53202c5ab4943b29986f2b32111017c2e00be9e26253525044bce6d8f965"

RPROVIDES:${PN} += "python3.11dist(netifaces) \
python311-netifaces \
python311-netifaces(aarch-64) \
python3dist(netifaces)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
