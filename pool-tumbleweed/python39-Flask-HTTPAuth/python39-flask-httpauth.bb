SUMMARY = "Basic and Digest HTTP authentication for Flask routes"
DESCRIPTION = "Simple extension that provides Basic and Digest HTTP authentication for Flask routes."
LICENSE = "MIT"

PV = "4.8.0"

RPM_NAME = "python39-Flask-HTTPAuth-4.8.0-1.1.noarch.rpm"
RPM_HASH = "a325cd9b54cd295a3017b53b3af8f2359642dbbb7e62dce5f91ae9d6258b108ef6951c895506c8b3b82bc4a6541bea8f9bf3fdbf1ad7eb3a475d9424ce6f8e9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-httpauth \
python39-Flask-HTTPAuth \
python3dist-flask-httpauth"

RDEPENDS:${PN} += "python-abi \
python39-Flask"

inherit rpm
