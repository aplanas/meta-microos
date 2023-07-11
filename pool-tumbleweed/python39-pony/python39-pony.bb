SUMMARY = "Pony Object-Relational Mapper"
DESCRIPTION = "Pony ORM is a object-relational mapper for Python. Using Pony, users \
can create and maintain database-oriented software applications. Pony \
is able to write queries to the database using generator expressions. \
Pony then analyzes the abstract syntax tree of a generator and \
translates it to its SQL equivalent."
LICENSE = "Apache-2.0"

PV = "0.7.16"

RPM_NAME = "python39-pony-0.7.16-2.4.noarch.rpm"
RPM_HASH = "1238dec7438511d187897ee39dead1b653c46704088afd85d7ceda8dc23cf159aa892e9003f5358a4ee86332cbd8f374c900730548afbdbd4689f1521acf3fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pony \
python39-pony \
python3dist-pony"

RDEPENDS:${PN} += "python-abi \
python39"

inherit rpm
