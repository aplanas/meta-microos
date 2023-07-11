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

RPM_NAME = "python310-sqlglot-7.0.0-1.5.noarch.rpm"
RPM_HASH = "49b7dd3f225e2df5d68931b36efe72ddc5e53d80a77ec8e40019e1211a7503358e9162e2edacc7d2dce6ca30e184276b177d2b00500428a1db08e1250dc16a32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sqlglot \
python310-sqlglot \
python3dist-sqlglot"

RDEPENDS:${PN} += "python-abi"

inherit rpm
