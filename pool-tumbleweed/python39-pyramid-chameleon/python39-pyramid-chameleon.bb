SUMMARY = "Pyramid Chameleon integration"
DESCRIPTION = "These are bindings for the `Chameleon templating system \
<http://pagetemplates.org/>`_ for the Pyramid_ web framework."
LICENSE = "BSD-3-Clause & ZPL-2.1 & MIT"

PV = "0.3"

RPM_NAME = "python39-pyramid-chameleon-0.3-5.10.noarch.rpm"
RPM_HASH = "4f2fb3159d5c649af52941fdcea4a046c1b84065eddc6ba1afb3efb867eb6e95101412e4366802256ef4b6553e45bad3d2abc40d83eee4ce90fff31b3e404690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyramid-chameleon \
python39-pyramid-chameleon \
python3dist-pyramid-chameleon"

RDEPENDS:${PN} += "python-abi \
python39-Chameleon \
python39-pyramid"

inherit rpm
