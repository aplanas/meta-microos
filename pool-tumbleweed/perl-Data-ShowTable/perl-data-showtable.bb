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

RPM_NAME = "perl-Data-ShowTable-4.6-3.28.noarch.rpm"
RPM_HASH = "ba4e3b0b12311c178398b271ecb16803c5dc2e4ebe7dbfe48e33ddcfc4777f38d15d73328ab2b82ff0403d5eb0136c9e89520a06a18840d6be26ba20638e938e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--ShowTable \
perl-Data-ShowTable"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
