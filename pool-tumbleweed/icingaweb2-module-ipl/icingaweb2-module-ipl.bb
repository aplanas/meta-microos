SUMMARY = "Business Processes Icinga Web 2 module"
DESCRIPTION = "Create top-level views of your applications in a graphical editor. \
Rules express dependencies between existing hosts and services and \
let you alert on application level. Business processes are displayed \
in a tree or list overview."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "icingaweb2-module-ipl-0.5.0-1.13.noarch.rpm"
RPM_HASH = "817398417f73d8e6e4f51a66ae15d816cceb0328c876d45bc324ef866346c9eb6cf7e4249cf215291c1a5d49f9ebe76149f787b73ce5b1c6ca99061ae25c962d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-module-ipl"

RDEPENDS:${PN} += "icingaweb2 \
icingaweb2-module-director"

inherit rpm
