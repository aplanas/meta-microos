SUMMARY = "A tool to manage identities"
DESCRIPTION = "A tool to manage identities. \
 \
Sorting Hat maintains an SQL database with identities coming \
(potentially) from different sources. Identities corresponding to the \
same real person can be merged in the same unique identity, with a \
unique uuid. For each unique identity, a profile can be defined, with \
the name and other data to show for the corresponding person by default. \
 \
In addition, each unique identity can be related to one or more \
affiliations, for different time periods. This will usually correspond \
to different organizations in which the person was employed during those \
time periods. \
 \
Sorting Hat is a part of the GrimoireLab \
toolset <https://grimoirelab.github.io>, which provides for Python \
modules and scripts to analyze data sources with information about \
software development, and allows to produce interactive dashboards to \
visualize that information. \
 \
In the context of GrimoireLab, Sorting Hat is usually run after data is \
retrieved with Perceval <https://github.com/grimmoirelab/perceval>, \
to store the identities obtained into its database, and later merge them \
into unique identities (and maybe affiliate them)."
LICENSE = "GPL-3.0-only"

PV = "0.12.0"

RPM_NAME = "python39-sortinghat-0.12.0-1.1.noarch.rpm"
RPM_HASH = "047c26158a3382f3cd0cce563c8de09724f19211bee57dcea584bf789c6e63604aa313b321ea2d463f30340e2b0a341d259ec1ea59d3ad5890aab5dd6c48f9b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sortinghat \
python39-sortinghat \
python3dist-sortinghat"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Django \
python39-Jinja2 \
python39-PyJWT \
python39-PyMySQL \
python39-PyYAML \
python39-SQLAlchemy \
python39-click \
python39-django-cors-headers \
python39-django-graphql-jwt \
python39-django-rq \
python39-django-treebeard \
python39-graphene \
python39-graphene-django \
python39-grimoirelab-toolkit \
python39-mysqlclient \
python39-pandas \
python39-python-dateutil \
python39-requests \
python39-rq \
python39-sgqlc \
update-alternatives"

inherit rpm
