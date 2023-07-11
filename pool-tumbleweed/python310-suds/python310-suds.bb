SUMMARY = "Lightweight SOAP client"
DESCRIPTION = "Suds is a lightweight SOAP-based web service client for Python. \
 \
Although the original suds package stopped releasing versions after \
0.4, many (but not all) other open source projects moved to a \
maintained fork known as 'suds-jurko'. This is a community fork of \
that fork that is releasing packages under the main suds package name \
(and suds-community for consistency until version 2.x of this \
package)."
LICENSE = "LGPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "python310-suds-1.1.2-1.5.noarch.rpm"
RPM_HASH = "d404e5f63e57583f8a7ea282f53fcefee118c397bb6972b76d32554108cfb951e31b043a6d89e0fd1c69e7a6823cd439516f98e6b7c2be826a24650e91893984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-suds-community \
python310-suds \
python310-suds-community \
python310-suds-jurko \
python3dist-suds-community"

RDEPENDS:${PN} += "python-abi"

inherit rpm
