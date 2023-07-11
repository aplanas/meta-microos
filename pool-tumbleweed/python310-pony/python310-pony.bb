SUMMARY = "Pony Object-Relational Mapper"
DESCRIPTION = "Pony ORM is a object-relational mapper for Python. Using Pony, users \
can create and maintain database-oriented software applications. Pony \
is able to write queries to the database using generator expressions. \
Pony then analyzes the abstract syntax tree of a generator and \
translates it to its SQL equivalent."
LICENSE = "Apache-2.0"

PV = "0.7.16"

RPM_NAME = "python310-pony-0.7.16-2.4.noarch.rpm"
RPM_HASH = "149ddb408145e0b61595b670e89a0627d2dd0fbe74e20d71d00eb7dfa1ed4503a7a176c1e59cd874aeb3277b18ebebfcafa7ad4477cc43745372bf07bcefd921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pony \
python310-pony \
python3dist-pony"

RDEPENDS:${PN} += "python-abi \
python310"

inherit rpm
