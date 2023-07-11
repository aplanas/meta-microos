SUMMARY = "A python interface to Last.fm"
DESCRIPTION = "A Python interface to Last.fm and other API-compatible websites such as Libre.fm \
 \
Features: \
- Simple public interface. \
- Access to all the data exposed by the Last.fm webservices. \
- Scrobbling support. \
- Full object-oriented design. \
- Proxy support. \
- Internal caching support for some webservices calls (disabled by default). \
- No extra dependencies but python itself. \
- Support for other API-compatible networks like Libre.fm \
- Python3-friendly (Starting from 0.5)."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "python311-pylast-4.5.0-3.5.noarch.rpm"
RPM_HASH = "2ce80625432b6d06df0e5ae4e2495080aac74db2def7896b31df0d824ca34b66b70f137aa1b0000f0d61bf37af2380312935941f58bb33029e253b66c286f61e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylast \
python3.11dist-pylast \
python311-pylast \
python3dist-pylast"

RDEPENDS:${PN} += "python-abi"

inherit rpm
