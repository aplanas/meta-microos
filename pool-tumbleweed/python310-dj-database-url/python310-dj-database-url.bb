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

RPM_NAME = "python310-dj-database-url-1.3.0-2.3.noarch.rpm"
RPM_HASH = "41589fc0821508b1ed786e3ae60b52186eada0b2cf0d3a9bd4d0eb7b92504188ca5cfda2bf887776d754c3cac09c4d2d6ff27c08be83fd116cd0835ff5c24d69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dj-database-url \
python310-dj-database-url \
python3dist-dj-database-url"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-typing-extensions"

inherit rpm
