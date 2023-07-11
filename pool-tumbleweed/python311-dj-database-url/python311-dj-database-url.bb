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

RPM_NAME = "python311-dj-database-url-1.3.0-2.3.noarch.rpm"
RPM_HASH = "d7b5490cceec976b87527a3dbccf506d8062fd66d99f64971a1e4155d927a06f8dfba44207cd38afac38519a1f36b8b5667fa03955029c5e4c1abd26c64504fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dj-database-url \
python3.11dist-dj-database-url \
python311-dj-database-url \
python3dist-dj-database-url"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-typing-extensions"

inherit rpm
