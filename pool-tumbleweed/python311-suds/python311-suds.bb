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

RPM_NAME = "python311-suds-1.1.2-1.3.noarch.rpm"
RPM_HASH = "c462b37dca25743e562bc403e5e8932eb642227a33af7a6d5f2dcadf0d7a3913826b85329112da0e6bff9a458917ec13198568b8cd0632e88abd5ef6714c036f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-suds-community \
python311-suds \
python311-suds-community \
python311-suds-jurko \
python3dist-suds-community"

RDEPENDS:${PN} += "python-abi"

inherit rpm
