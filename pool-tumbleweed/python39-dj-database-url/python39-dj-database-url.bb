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

RPM_NAME = "python39-dj-database-url-1.3.0-2.3.noarch.rpm"
RPM_HASH = "9ad7a44dd34d5a8aadf71e95562a57ae1f236f324f2ff8c541beaa3e42ba30b6e7144077c93a1efda6a087e2d17430bd80e248f4a5c1e6e27bcf50549c3c8190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dj-database-url \
python39-dj-database-url \
python3dist-dj-database-url"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-typing-extensions"

inherit rpm
