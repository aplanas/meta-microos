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

RPM_NAME = "python310-sortinghat-0.7.23-1.5.noarch.rpm"
RPM_HASH = "2032e0a1455de7780d0b7a4887ef8f3d4590533f814828695bdba8841e1b4e88e6d35c1dadc293494c0699e22c56a16e6ed843414f1ec4835b41dd27060cd71c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sortinghat \
python3.10dist-sortinghat \
python310-sortinghat \
python3dist-sortinghat"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-Jinja2 \
python310-PyMySQL \
python310-PyYAML \
python310-SQLAlchemy \
python310-pandas \
python310-python-dateutil \
python310-requests \
python310-urllib3 \
update-alternatives"

inherit rpm
