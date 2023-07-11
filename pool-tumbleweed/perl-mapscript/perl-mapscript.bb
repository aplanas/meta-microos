SUMMARY = "Perl/Mapscript map making extensions to Perl"
DESCRIPTION = "The Perl/Mapscript extension provides full map customization capabilities \
within the Perl programming language."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "perl-mapscript-8.0.0-2.7.aarch64.rpm"
RPM_HASH = "01ceedb92f9795504baa22b8c02e322e447b7b6d548bbfc37242a91d6591894932016fa03c30a3a89721b35f77048bbac92e88d70a5855d801ed0ed71d974bcd"

RPROVIDES:${PN} += "mapserver-perl \
perl-mapscript \
perl-mapscript--CompositingFilter \
perl-mapscript--DBFInfo \
perl-mapscript--LayerCompositer \
perl-mapscript--OWSRequest \
perl-mapscript--classObj \
perl-mapscript--clusterObj \
perl-mapscript--colorObj \
perl-mapscript--configObj \
perl-mapscript--errorObj \
perl-mapscript--fontSetObj \
perl-mapscript--hashTableObj \
perl-mapscript--imageObj \
perl-mapscript--intarray \
perl-mapscript--labelCacheMemberObj \
perl-mapscript--labelCacheObj \
perl-mapscript--labelCacheSlotObj \
perl-mapscript--labelLeaderObj \
perl-mapscript--labelObj \
perl-mapscript--layerObj \
perl-mapscript--legendObj \
perl-mapscript--lineObj \
perl-mapscript--mapObj \
perl-mapscript--markerCacheMemberObj \
perl-mapscript--outputFormatObj \
perl-mapscript--pointObj \
perl-mapscript--projectionObj \
perl-mapscript--queryMapObj \
perl-mapscript--rectObj \
perl-mapscript--referenceMapObj \
perl-mapscript--reprojectionObj \
perl-mapscript--resultCacheObj \
perl-mapscript--resultObj \
perl-mapscript--scaleTokenEntryObj \
perl-mapscript--scaleTokenObj \
perl-mapscript--scalebarObj \
perl-mapscript--shapeObj \
perl-mapscript--shapefileObj \
perl-mapscript--styleObj \
perl-mapscript--symbolObj \
perl-mapscript--symbolSetObj \
perl-mapscript--webObj \
perl-mapscriptc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmapserver.so.2 \
libmapserver2 \
libperl.so \
perl-base"

inherit rpm
