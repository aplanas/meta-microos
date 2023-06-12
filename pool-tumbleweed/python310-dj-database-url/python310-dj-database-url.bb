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

RPM_NAME = "python310-dj-database-url-1.3.0-2.1.noarch.rpm"
RPM_HASH = "0fb03580082e235078696baf95976c55c6b33dc8f9791e6872e5cd49432049976b6e2954e31706ed61cd54d3aebdaa48aee2993dd2abbc4cae87e20bc14231c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dj-database-url \
python3.10dist(dj-database-url) \
python310-dj-database-url \
python3dist(dj-database-url)"
RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-typing_extensions"

inherit rpm