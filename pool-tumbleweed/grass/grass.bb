SUMMARY = "Geographic Resources Analysis Support System"
DESCRIPTION = "GRASS (Geographic Resources Analysis Support System), commonly \
referred to as GRASS, is a Geographic Information System \
(GIS) used for geospatial data management and analysis, image \
processing, graphics/maps production, spatial modeling, and \
visualization. GRASS is currently used in academic and commercial \
settings around the world, as well as by many governmental agencies \
and environmental consulting companies."
LICENSE = "GPL-2.0-or-later"

PV = "8.2.1"

RPM_NAME = "grass-8.2.1-1.3.aarch64.rpm"
RPM_HASH = "59de5e3cc608eb989eaddee7ec7ea951dd281ab09d3cd8222c603c72a5a09bf9ccbc5e8a5e1e6d4cd1583b8516dc1c9741a6ac6e2be455cb865dcb077985e535"

RPROVIDES:${PN} += "config-grass \
grass \
libgrass-arraystats.8.2.so \
libgrass-bitmap.8.2.so \
libgrass-btree.8.2.so \
libgrass-btree2.8.2.so \
libgrass-cairodriver.8.2.so \
libgrass-calc.8.2.so \
libgrass-ccmath.8.2.so \
libgrass-cdhc.8.2.so \
libgrass-cluster.8.2.so \
libgrass-datetime.8.2.so \
libgrass-dbmibase.8.2.so \
libgrass-dbmiclient.8.2.so \
libgrass-dbmidriver.8.2.so \
libgrass-dbstubs.8.2.so \
libgrass-dgl.8.2.so \
libgrass-dig2.8.2.so \
libgrass-display.8.2.so \
libgrass-driver.8.2.so \
libgrass-dspf.8.2.so \
libgrass-g3d.8.2.so \
libgrass-gis.8.2.so \
libgrass-gmath.8.2.so \
libgrass-gpde.8.2.so \
libgrass-gproj.8.2.so \
libgrass-htmldriver.8.2.so \
libgrass-imagery.8.2.so \
libgrass-interpdata.8.2.so \
libgrass-interpfl.8.2.so \
libgrass-iortho.8.2.so \
libgrass-lidar.8.2.so \
libgrass-linkm.8.2.so \
libgrass-lrs.8.2.so \
libgrass-manage.8.2.so \
libgrass-neta.8.2.so \
libgrass-nviz.8.2.so \
libgrass-ogsf.8.2.so \
libgrass-pngdriver.8.2.so \
libgrass-psdriver.8.2.so \
libgrass-qtree.8.2.so \
libgrass-raster.8.2.so \
libgrass-rli.8.2.so \
libgrass-rowio.8.2.so \
libgrass-rtree.8.2.so \
libgrass-segment.8.2.so \
libgrass-shape.8.2.so \
libgrass-sim.8.2.so \
libgrass-sqlp.8.2.so \
libgrass-stats.8.2.so \
libgrass-symb.8.2.so \
libgrass-temporal.8.2.so \
libgrass-vector.8.2.so \
libgrass-vedit.8.2.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
libGL.so.1 \
libGLU.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXext.so.6 \
libXrender.so.1 \
libblas.so.3 \
libbz2.so.1 \
libc.so.6 \
libcairo.so.2 \
libfftw3.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgdal.so.32 \
libgeos-c.so.1 \
libgomp.so.1 \
libhistory.so.8 \
liblapack.so.3 \
libm.so.6 \
libmariadb.so.3 \
libnetcdf.so.19 \
libodbc.so.2 \
libpdal-base.so.13 \
libpdal-util.so.13 \
libpng16.so.16 \
libpq.so.5 \
libproj.so.25 \
libreadline.so.8 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1 \
libzstd.so.1 \
proj \
python3-dateutil \
python3-numpy \
python3-opengl \
python3-wxPython \
python3-xml \
sqlite \
unixODBC \
xterm"

inherit rpm
