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

RPM_NAME = "python310-netifaces-0.11.0-2.3.aarch64.rpm"
RPM_HASH = "bc00eda1a83883101afbb4bdeb5e6f70cccc1cad2debf1ad9fb31f1ff36d0cc5f51e9d48f69d5fd3fc033ae9e17fbf91ce46a2becba026d0c105dea8d63c5101"

RPROVIDES:${PN} += "python3.10dist-netifaces \
python310-netifaces \
python3dist-netifaces"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
