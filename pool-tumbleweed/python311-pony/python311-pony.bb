SUMMARY = "Pony Object-Relational Mapper"
DESCRIPTION = "Pony ORM is a object-relational mapper for Python. Using Pony, users \
can create and maintain database-oriented software applications. Pony \
is able to write queries to the database using generator expressions. \
Pony then analyzes the abstract syntax tree of a generator and \
translates it to its SQL equivalent."
LICENSE = "Apache-2.0"

PV = "0.7.16"

RPM_NAME = "python311-pony-0.7.16-2.4.noarch.rpm"
RPM_HASH = "6f0fdeca91d88f653c9d598c0d6b11bc47ced23d90eaec10ece14a859c21eeac96a646efbada98d33234fb12ee101b8772a5d1f56d9e1ac541978a7ad7f69773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pony \
python3.11dist-pony \
python311-pony \
python3dist-pony"

RDEPENDS:${PN} += "python-abi \
python311"

inherit rpm
