SUMMARY = "Perl module for extracting the content contained in tables within an HTM[cut]"
DESCRIPTION = "HTML::TableExtract is a subclass of HTML::Parser that serves to extract the \
information from tables of interest contained within an HTML document. The \
information from each extracted table is stored in table objects. Tables \
can be extracted as text, HTML, or HTML::ElementTable structures (for \
in-place editing or manipulation). \
 \
There are currently four constraints available to specify which tables you \
would like to extract from a document: _Headers_, _Depth_, _Count_, and \
_Attributes_. \
 \
_Headers_, the most flexible and adaptive of the techniques, involves \
specifying text in an array that you expect to appear above the data in the \
tables of interest. Once all headers have been located in a row of that \
table, all further cells beneath the columns that matched your headers are \
extracted. All other columns are ignored: think of it as vertical slices \
through a table. In addition, TableExtract automatically rearranges each \
row in the same order as the headers you provided. If you would like to \
disable this, set _automap_ to 0 during object creation, and instead rely \
on the column_map() method to find out the order in which the headers were \
found. Furthermore, TableExtract will automatically compensate for cell \
span issues so that columns are really the same columns as you would \
visually see in a browser. This behavior can be disabled by setting the \
_gridmap_ parameter to 0. HTML is stripped from the entire textual content \
of a cell before header matches are attempted -- unless the _keep_html_ \
parameter was enabled. \
 \
_Depth_ and _Count_ are more specific ways to specify tables in relation to \
one another. _Depth_ represents how deeply a table resides in other tables. \
The depth of a top-level table in the document is 0. A table within a \
top-level table has a depth of 1, and so on. Each depth can be thought of \
as a layer; tables sharing the same depth are on the same layer. Within \
each of these layers, _Count_ represents the order in which a table was \
seen at that depth, starting with 0. Providing both a _depth_ and a _count_ \
will uniquely specify a table within a document. \
 \
_Attributes_ match based on the attributes of the html <table> tag, for \
example, border widths or background color. \
 \
Each of the _Headers_, _Depth_, _Count_, and _Attributes_ specifications \
are cumulative in their effect on the overall extraction. For instance, if \
you specify only a _Depth_, then you get all tables at that depth (note \
that these could very well reside in separate higher- level tables \
throughout the document since depth extends across tables). If you specify \
only a _Count_, then the tables at that _Count_ from all depths are \
returned (i.e., the _n_th occurrence of a table at each depth). If you only \
specify _Headers_, then you get all tables in the document containing those \
column headers. If you have specified multiple constraints of _Headers_, \
_Depth_, _Count_, and _Attributes_, then each constraint has veto power \
over whether a particular table is extracted. \
 \
If no _Headers_, _Depth_, _Count_, or _Attributes_ are specified, then all \
tables match. \
 \
When extracting only text from tables, the text is decoded with \
HTML::Entities by default; this can be disabled by setting the _decode_ \
parameter to 0."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.15"

RPM_NAME = "perl-HTML-TableExtract-2.15-1.13.noarch.rpm"
RPM_HASH = "dc4f5d2630826732db1ec9fc3930985d5314942e706ee162e60ebc9fcb2889aec7bc2c8c6218c4838125e9d85f1dc4f410904b1ff22257d7aeaeb7983a799dc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTML::TableExtract) \
perl(HTML::TableExtract::Rasterize) \
perl(HTML::TableExtract::StripHTML) \
perl(HTML::TableExtract::Table) \
perl-HTML-TableExtract"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(HTML::ElementTable) \
perl(HTML::Parser)"

inherit rpm
