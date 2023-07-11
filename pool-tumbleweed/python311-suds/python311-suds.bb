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

RPM_NAME = "python311-suds-1.1.2-1.5.noarch.rpm"
RPM_HASH = "f3ad4dcd61f3c5ecb832ee58d5ac63dd56482bdc77c3abd0d5167c3879010c2539deb4e00ab03bf1d22ed460f08b58883226ae4e7e520b8eafa028785808833d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-suds \
python3-suds-community \
python3-suds-jurko \
python3.11dist-suds-community \
python311-suds \
python311-suds-community \
python311-suds-jurko \
python3dist-suds-community"

RDEPENDS:${PN} += "python-abi"

inherit rpm
