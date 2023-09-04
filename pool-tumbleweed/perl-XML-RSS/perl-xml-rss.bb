SUMMARY = "Creates and updates RSS files"
DESCRIPTION = "This module provides a basic framework for creating and maintaining RDF \
Site Summary (RSS) files. This distribution also contains many examples \
that allow you to generate HTML from an RSS, convert between 0.9, 0.91, \
1.0, and 2.0 version, and other nifty things. This might be helpful if you \
want to include news feeds on your Web site from sources like Slashdot and \
Freshmeat or if you want to syndicate your own content. \
 \
XML::RSS currently supports versions at http://www.rssboard.org/rss-0-9-0, \
at http://www.rssboard.org/rss-0-9-1, at http://web.resource.org/rss/1.0/, \
and at http://www.rssboard.org/rss-2-0 of RSS. \
 \
RSS was originally developed by Netscape as the format for Netscape \
Netcenter channels, however, many Web sites have since adopted it as a \
simple syndication format. With the advent of RSS 1.0, users are now able \
to syndication many different kinds of content including news headlines, \
threaded messages, products catalogs, etc. \
 \
*Note:* In order to parse and generate dates (such as 'pubDate' and \
'dc:date') it is recommended to use DateTime::Format::Mail and \
DateTime::Format::W3CDTF , which is what XML::RSS uses internally and \
requires. It should also be possible to pass DateTime objects which will be \
formatted accordingly. E.g: \
 \
    use DateTime (); \
 \
    my $dt = DateTime->from_epoch(epoch => 1_500_000_000); \
 \
    $rss->channel( \
        pubDate => $dt, \
        . \
        . \
        . \
    );"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.62"

RPM_NAME = "perl-XML-RSS-1.62-1.14.noarch.rpm"
RPM_HASH = "ad4c63058770ba2ac9a424c554195b24171657435f26fba608f58397c33d8ddbd58ddaaf24c0fdd733644a8be431526e5ba54535c3ce0897e7151ca12ddbb9cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--RSS \
perl-XML--RSS--Private--Output--Base \
perl-XML--RSS--Private--Output--Roles--ImageDims \
perl-XML--RSS--Private--Output--Roles--ModulesElems \
perl-XML--RSS--Private--Output--V0-9 \
perl-XML--RSS--Private--Output--V0-91 \
perl-XML--RSS--Private--Output--V1-0 \
perl-XML--RSS--Private--Output--V2-0 \
perl-XML-RSS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DateTime--Format--Mail \
perl-DateTime--Format--W3CDTF \
perl-HTML--Entities \
perl-XML--Parser"

inherit rpm
