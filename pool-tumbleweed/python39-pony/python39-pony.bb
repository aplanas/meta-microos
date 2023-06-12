SUMMARY = "Pony Object-Relational Mapper"
DESCRIPTION = "Pony ORM is a object-relational mapper for Python. Using Pony, users \
can create and maintain database-oriented software applications. Pony \
is able to write queries to the database using generator expressions. \
Pony then analyzes the abstract syntax tree of a generator and \
translates it to its SQL equivalent."
LICENSE = "Apache-2.0"

PV = "0.7.16"

RPM_NAME = "python39-pony-0.7.16-2.2.noarch.rpm"
RPM_HASH = "ce5337c2663189d4e55354fd96ef65138102f12bbf2bd6e486bcdfbfd2aa7cdb007b51744725df8debd11bdf237fd34f56147e3e34bd2b12dfdc38881a646339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pony) \
python39-pony \
python3dist(pony)"
RDEPENDS:${PN} += "python(abi) \
python39"

inherit rpm
