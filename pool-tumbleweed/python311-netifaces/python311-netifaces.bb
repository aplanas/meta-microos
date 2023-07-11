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

RPM_NAME = "python311-netifaces-0.11.0-2.3.aarch64.rpm"
RPM_HASH = "c20a022743625b6f864fb3f0986adc0a8ad8aef8b88e7a04e00846ab592066363141af0d90a3f46441e5e5d334e680f46396f30e37ae6916df608b3dd198926e"

RPROVIDES:${PN} += "python3-netifaces \
python3.11dist-netifaces \
python311-netifaces \
python3dist-netifaces"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
