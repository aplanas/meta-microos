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

PV = "0.7.23"

RPM_NAME = "python311-sortinghat-0.7.23-1.5.noarch.rpm"
RPM_HASH = "3cbd85d02b50957415b062932fc30395d06671e5ef839d88f4d2054c4568bfa9473ccfdc0485a4a0e46e238075689693f7de4713699d871d2dc8b831fcfc72bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sortinghat) \
python311-sortinghat \
python3dist(sortinghat)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Jinja2 \
python311-PyMySQL \
python311-PyYAML \
python311-SQLAlchemy \
python311-pandas \
python311-python-dateutil \
python311-requests \
python311-urllib3 \
update-alternatives"

inherit rpm
