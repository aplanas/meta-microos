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

RPM_NAME = "python311-sortinghat-0.12.0-1.1.noarch.rpm"
RPM_HASH = "0227084ba8e2252469f9c588f3820c368de9f8c2f585c2c0b44b4a36ca2433362f901c44e59d574d5a9e6a1afdf77c50e128db6dd2d5934f9348e5bc0850d3b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sortinghat \
python3.11dist-sortinghat \
python311-sortinghat \
python3dist-sortinghat"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Django \
python311-Jinja2 \
python311-PyJWT \
python311-PyMySQL \
python311-PyYAML \
python311-SQLAlchemy \
python311-click \
python311-django-cors-headers \
python311-django-graphql-jwt \
python311-django-rq \
python311-django-treebeard \
python311-graphene \
python311-graphene-django \
python311-grimoirelab-toolkit \
python311-mysqlclient \
python311-pandas \
python311-python-dateutil \
python311-requests \
python311-rq \
python311-sgqlc \
update-alternatives"

inherit rpm
