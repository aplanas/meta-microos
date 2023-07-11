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

RPM_NAME = "python311-sqlglot-7.0.0-1.5.noarch.rpm"
RPM_HASH = "5afd8ea884bf9badffc08b9d65c6a6e8fa61c240d24a6f3d6ef24fee6d75e1f5274bb794790f47f169346af5050a3fecd7b67a3ad717a1bd43d742ab5723ad68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlglot \
python3.11dist-sqlglot \
python311-sqlglot \
python3dist-sqlglot"

RDEPENDS:${PN} += "python-abi"

inherit rpm
