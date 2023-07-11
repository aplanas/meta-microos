SUMMARY = "An easily customizable SQL parser and transpiler"
DESCRIPTION = "SQLGlot is a no dependency Python SQL parser, transpiler, and optimizer. It can be \
used to format SQL or translate between different dialects like DuckDB, Presto, \
Spark, Snowflake, and BigQuery. It aims to read a wide variety of SQL inputs and \
output syntactically correct SQL in the targeted dialects. \
 \
It is a very comprehensive generic SQL parser with a robust test suite. It is also \
quite performant while being written purely in Python. You can easily customize the \
parser, analyze queries, traverse expression trees, and programmatically build SQL. \
Syntax errors are highlighted and dialect incompatibilities can warn or raise \
depending on configurations."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python39-sqlglot-7.0.0-1.5.noarch.rpm"
RPM_HASH = "103548748a2c24900c64bf3aa3be57f1fa2235e35dad4c87795b097272c14017a9f3dc6f99b84f061af679a46e98eeaed14d2c3dbe33efba5ddfe724a3733e1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sqlglot \
python39-sqlglot \
python3dist-sqlglot"

RDEPENDS:${PN} += "python-abi"

inherit rpm
