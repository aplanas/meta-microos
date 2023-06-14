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

RPM_NAME = "gnuhealth-thalamus-0.9.14-1.9.noarch.rpm"
RPM_HASH = "7f022c37c5b308fb4df5d1f4919eb394efae17460b0d360feaa8060c356324b911fc1eaf5da31052123f296a8ad778e659b72f8e916c4f7bcf5c98e0da7929d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuhealth-thalamus \
python3.10dist-thalamus \
python3dist-thalamus"

RDEPENDS:${PN} += "/bin/bash \
postgresql-server \
python-abi \
python3-Flask \
python3-Flask-HTTPAuth \
python3-Flask-RESTful \
python3-Flask-WTF \
python3-bcrypt \
python3-psycopg2"

inherit rpm
