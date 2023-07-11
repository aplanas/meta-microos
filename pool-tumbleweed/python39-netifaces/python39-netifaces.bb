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

RPM_NAME = "python39-netifaces-0.11.0-2.3.aarch64.rpm"
RPM_HASH = "332790de389fcee2cdbd2223ae7a5397c71d940314995be6dfc7e10d427703fa9013d58a5ac61516c642b3b9c1ac5b80c943b6c9295351aebe8a0813f59185e0"

RPROVIDES:${PN} += "python3.9dist-netifaces \
python39-netifaces \
python3dist-netifaces"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
