SUMMARY = "Utility to use database URLs in Django applications"
DESCRIPTION = "This Django utility allows you to utilize the 12factor inspired \
DATABASE_URL environment variable to configure Django applications. \
 \
The `dj_database_url.config` method returns a Django database connection \
dictionary, populated with all the data specified in your URL. There is \
also a `conn_max_age` argument to easily enable Django's connection pool. \
 \
If you'd rather not use an environment variable, you can pass a URL in directly \
instead to ``dj_database_url.parse``. \
 \
Supported Databases \
------------------- \
 \
Support currently exists for PostgreSQL, PostGIS, MySQL, MySQL (GIS), \
Oracle, Oracle (GIS), and SQLite."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python39-dj-database-url-1.3.0-2.1.noarch.rpm"
RPM_HASH = "b7c3e6d1ef3348a3a2b9534803aeefabb58e7577b12d3ed1016dc7567c97607321d0a2752838501d3988e7c49b762bbb74084a236231bd55fd4d60a778ec2906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dj-database-url) \
python39-dj-database-url \
python3dist(dj-database-url)"
RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-typing_extensions"

inherit rpm
