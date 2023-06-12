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

RPM_NAME = "python39-suds-1.1.2-1.3.noarch.rpm"
RPM_HASH = "0b39fe0360bb8cfc335206164cd8e82325093b1bedfc45fdcbde06556522bad457601dfb8e23961be6bfe892417fb721cc4816d33cd084e246b51a1e751ea2d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(suds-community) \
python39-suds \
python39-suds-community \
python39-suds-jurko \
python3dist(suds-community)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
