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

RPM_NAME = "python311-sqlglot-7.0.0-1.3.noarch.rpm"
RPM_HASH = "0abb4a07ac88898a116de69a41bd5d414cb82c12f157704e67fc779a2b8fbd286ee5f4f06dedb0ce04ca80366919ef5115eb8e7ec592de62ac9bc94550e90789"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sqlglot) \
python311-sqlglot \
python3dist(sqlglot)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
