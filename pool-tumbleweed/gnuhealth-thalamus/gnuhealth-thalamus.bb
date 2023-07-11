SUMMARY = "The GNU Health Federation Message and Authentication Server"
DESCRIPTION = "Thalamus: The GNU Health Federation Message and Authentication Server \
===================================================================== \
 \
The Thalamus project provides a RESTful API hub to all the GNU Health \
Federation nodes. The main functions are: \
 \
 \
   the participating nodes in the GNU Health Federation and the GNU Health \
   Information System (MongoDB). Some of the participating nodes include \
   the GNU Health HMIS, MyGNUHealth mobile PHR application, \
   laboratories, research institutions and civil offices. \
 \
 \
   authorization server to interact with the GNUHealth Information System \
 \
 \
Thalamus is part of the GNU Health project, but it is a self contained, \
independent server that can be used in different health related scenarios."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.14"

RPM_NAME = "gnuhealth-thalamus-0.9.14-1.11.noarch.rpm"
RPM_HASH = "6fc9b7ff518474673abf36540ef4fe97646159c644df06710ad1e28db92b9934235a1042213191418ffcd8f822e08f41e3c7a8eda7ad284b9b7578a061d28362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuhealth-thalamus \
python3.11dist-thalamus \
python3dist-thalamus"

RDEPENDS:${PN} += "/usr/bin/bash \
postgresql-server \
python-abi \
python3-Flask \
python3-Flask-HTTPAuth \
python3-Flask-RESTful \
python3-Flask-WTF \
python3-bcrypt \
python3-psycopg2"

inherit rpm
