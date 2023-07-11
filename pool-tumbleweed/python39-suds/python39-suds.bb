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

RPM_NAME = "python39-suds-1.1.2-1.5.noarch.rpm"
RPM_HASH = "ef26225499f3a9fac3e85dec89c0a4d144440d92063d28692ab0ca3a335eff56f6e4abbe7fece9190e31c5cbcf8707fe9e3be64300915fe298e90424c84d0ab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-suds-community \
python39-suds \
python39-suds-community \
python39-suds-jurko \
python3dist-suds-community"

RDEPENDS:${PN} += "python-abi"

inherit rpm
