SUMMARY = "routines to display tabular data in several formats."
DESCRIPTION = "The *ShowTable* module provides subroutines to display tabular data, \
typially from a database, in nicely formatted columns, in several formats. \
Its arguments can either be given in a fixed order, or, as a single, \
anonymous hash-array. \
 \
The output format for any one invocation can be one of four possible \
styles: \
 \
* Box \
 \
  A tabular format, with the column titles and the entire table surrounded \
  by a 'box' of ''+'', ''-'', and ''|'' characters. See the 'ShowBoxTable' \
  manpage for details. \
 \
* Table \
 \
  A simple tabular format, with columns automatically aligned, with column \
  titles. See the 'ShowSimpleTable' manpage. \
 \
* List \
 \
  A _list_ style, where columns of data are listed as a _name_:_value_ \
  pair, one pair per line, with rows being one or more column values, \
  separated by an empty line. See the 'ShowListTable' manpage. \
 \
* HTML \
 \
  The data is output as an HTML _TABLE_, suitable for display through a \
  _Web_-client. See the 'ShowHTMLTable' manpage. Input can either be plain \
  ASCII text, or text with embedded HTML elements, depending upon an \
  argument or global parameter. \
 \
The subroutines which perform these displays are listed below."
LICENSE = "GPL-2.0+"

PV = "4.6"

RPM_NAME = "perl-Data-ShowTable-4.6-3.26.noarch.rpm"
RPM_HASH = "302d222e886ff553bb6e651029a1c1fe92edbee8e618f158c026036ddb747d6859adfb0896f591c1b96443c90f9db952e12748fac86f0015ebeb29843cadaff2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--ShowTable \
perl-Data-ShowTable"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
