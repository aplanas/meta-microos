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

RPM_NAME = "python310-sortinghat-0.12.0-1.1.noarch.rpm"
RPM_HASH = "725f09ff3f814d772c4fd876f08561fc1fdd25013ffeb159e3ef11ee16202d64098acdb1c7332462d222b5b9f6e46761095cb5636debcc999c2409978273422d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sortinghat \
python310-sortinghat \
python3dist-sortinghat"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Django \
python310-Jinja2 \
python310-PyJWT \
python310-PyMySQL \
python310-PyYAML \
python310-SQLAlchemy \
python310-click \
python310-django-cors-headers \
python310-django-graphql-jwt \
python310-django-rq \
python310-django-treebeard \
python310-graphene \
python310-graphene-django \
python310-grimoirelab-toolkit \
python310-mysqlclient \
python310-pandas \
python310-python-dateutil \
python310-requests \
python310-rq \
python310-sgqlc \
update-alternatives"

inherit rpm
