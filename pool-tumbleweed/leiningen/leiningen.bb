SUMMARY = "Automation for Clojure projects"
DESCRIPTION = "Working on Clojure projects with tools designed for Java can be an \
exercise in frustration. With Leiningen, builds can be describe with \
Clojure. Leiningen handles fetching dependencies, running tests, \
packaging projects and can be extended with a number of plugins."
LICENSE = "EPL-1.0"

PV = "2.10.0"

RPM_NAME = "leiningen-2.10.0-1.2.noarch.rpm"
RPM_HASH = "bf337cab1efa52cd34d4bb6d349de2fccc074cd38bdde918e9d402e505113204e6df1dc25c5849ba69fa3d185a82d21498f579d4c9cb733cc152c0d8ec35d390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leiningen"
RDEPENDS:${PN} += "/usr/bin/env \
clojure \
java"

inherit rpm
