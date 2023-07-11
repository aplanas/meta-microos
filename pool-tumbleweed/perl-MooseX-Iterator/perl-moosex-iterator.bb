SUMMARY = "Iterate over collections"
DESCRIPTION = "This is an attempt to add smalltalk-like streams to Moose. It currently \
works with ArrayRefs and HashRefs. \
 \
* next \
 \
The next method provides the next item in the colletion. \
 \
  For arrays it returns the element of the array \
 \
  For hashs it returns a pair as a hashref with the keys: key and value \
 \
* has_next \
 \
The has_next method is a boolean method that is true if there is another \
item in the colletion after the current item. and falue if there isn't. \
 \
* peek \
 \
The peek method returns the next item without moving the state of the \
iterator forward. It returns undef if it is at the end of the collection. \
 \
* reset \
 \
Resets the cursor, so you can iterate through the elements again."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-MooseX-Iterator-0.11-10.20.noarch.rpm"
RPM_HASH = "14f79ef1cacd77413f00895657819cbc7b872b7a7b990169e9c5c3238d07b534be94218505ecf73f97f61e6abdeda92a84095d1161469927279ba6ab2499f3ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Moose--Meta--Attribute--Custom--Iterable \
perl-MooseX--Iterator \
perl-MooseX--Iterator--Array \
perl-MooseX--Iterator--Hash \
perl-MooseX--Iterator--Meta--Iterable \
perl-MooseX--Iterator--Role \
perl-MooseX-Iterator"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose"

inherit rpm
